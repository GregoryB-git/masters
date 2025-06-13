package main

import (
	"encoding/json"
	"flag"
	"fmt"
	"log"
	"strconv"

	"xraydga/internal"
)

type ReverseMatch struct {
	Input   string `json:"input"`
	Decoded int    `json:"decoded"`
	Salt    string `json:"salt"`
	Domain  string `json:"domain"`
}

func main() {
	targetDomain := flag.String("domain", "", "Target domain to reverse")
	salt := flag.String("salt", "", "Specific salt to use (optional)")
	saltStart := flag.Int("salt-start", 0, "Start of salt range (used if -salt is not set)")
	saltEnd := flag.Int("salt-end", 100, "End of salt range (exclusive)")
	maxInputs := flag.Int("max-inputs", 1_000_000, "Maximum input range to search")
	jsonOut := flag.Bool("json", false, "Output result as JSON")

	flag.Parse()

	if *targetDomain == "" {
		log.Fatal("❌ You must provide a -domain to reverse")
	}

	for i := 0; i < *maxInputs; i++ {
		input, err := internal.EncodeHashNumber(i)
		if err != nil {
			continue
		}

		val, err := internal.GetModuloConstant(input)
		if err != nil || val != 1 {
			continue
		}

		var saltsToTry []string
		if *salt != "" {
			saltsToTry = append(saltsToTry, *salt)
		} else {
			for s := *saltStart; s < *saltEnd; s++ {
				saltsToTry = append(saltsToTry, "salt"+strconv.Itoa(s))
			}
		}

		for _, s := range saltsToTry {
			genDomain, err := internal.CheckAndGenerate(input, s)
			if err != nil {
				continue
			}
			if genDomain == *targetDomain {
				match := ReverseMatch{
					Input:   input,
					Decoded: i,
					Salt:    s,
					Domain:  genDomain,
				}
				if *jsonOut {
					enc, _ := json.MarshalIndent(match, "", "  ")
					fmt.Println(string(enc))
				} else {
					fmt.Printf("✅ Found match!\nInput: %s\nDecoded: %d\nSalt: %s\nDomain: %s\n", input, i, s, genDomain)
				}
				return
			}
		}
	}

	log.Println("❌ No match found.")
}
