package main

import (
	"encoding/json"
	"flag"
	"fmt"
	"log"
	"os"
	"regexp"

	"xraydga/internal"
)

type MatchResult struct {
	Input   string `json:"input"`
	Salt    string `json:"salt"`
	Decoded int    `json:"decoded"`
	Domain  string `json:"domain"`
}

func main() {
	count := flag.Int("count", 1, "Number of valid inputs to find")
	regexPattern := flag.String("regex", "", "Optional regex that the final domain must match")
	salt := flag.String("salt", "default", "Salt to use during domain generation")
	jsonOut := flag.Bool("json", false, "Output results as JSON")
	outFile := flag.String("out", "", "Write results to file (JSONL format)")

	flag.Parse()

	var compiledRegex *regexp.Regexp
	var err error
	if *regexPattern != "" {
		compiledRegex, err = regexp.Compile(*regexPattern)
		if err != nil {
			log.Fatalf("❌ Invalid regex: %v", err)
		}
	}

	var file *os.File
	if *outFile != "" {
		file, err = os.Create(*outFile)
		if err != nil {
			log.Fatalf("❌ Failed to create file: %v", err)
		}
		defer file.Close()
	}

	found := 0
	maxAttempts := 1_000_000
	for i := 0; i < maxAttempts; i++ {
		input, err := internal.EncodeHashNumber(i)
		if err != nil {
			continue
		}
		val, err := internal.GetModuloConstant(input)
		if err != nil || val != 1 {
			continue
		}
		domain, err := internal.CheckAndGenerate(input, *salt)
		if err != nil {
			continue
		}

		if compiledRegex == nil || compiledRegex.MatchString(domain) {
			result := MatchResult{
				Input:   input,
				Salt:    *salt,
				Decoded: i,
				Domain:  domain,
			}

			if *jsonOut {
				jsonBytes, _ := json.Marshal(result)
				fmt.Println(string(jsonBytes))
			} else {
				fmt.Printf("✅ Input: %s (decoded = %d), Domain: %s\n", input, i, domain)
			}

			if file != nil {
				jsonBytes, _ := json.Marshal(result)
				file.Write(jsonBytes)
				file.WriteString("\n")
			}

			found++
			if found >= *count {
				return
			}
		}
	}

	log.Fatalf("❌ Only found %d valid inputs matching regex in %d attempts\n", found, maxAttempts)
}
