package main

import (
	"flag"
	"fmt"
	"log"
	"strconv"
	"xraydga/internal"
)

func main() {
	targetDomain := flag.String("domain", "", "Target domain to reverse")
	salt := flag.String("salt", "", "Specific salt to use (optional)")
	saltStart := flag.Int("salt-start", 0, "Start of salt range (used if -salt is not set)")
	saltEnd := flag.Int("salt-end", 100, "End of salt range (exclusive)")

	maxInputs := flag.Int("max-inputs", 1_000_000, "Maximum input range to search")

	flag.Parse()

	if *targetDomain == "" {
		log.Fatal("❌ You must provide a -domain to reverse")
	}

	fmt.Printf("🔍 Searching for input/salt to match domain: %s\n", *targetDomain)

	for i := 0; i < *maxInputs; i++ {
		input, err := internal.EncodeHashNumber(i)
		if err != nil {
			continue
		}

		val, err := internal.GetModuloConstant(input)
		if err != nil || val != 1 {
			continue
		}

		// Determine salt values to try
		saltsToTry := []string{}
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
				fmt.Printf("✅ Found match!\n")
				fmt.Printf("   Input: %s\n", input)
				fmt.Printf("   Decoded: %d\n", i)
				fmt.Printf("   Salt: %s\n", s)
				fmt.Printf("   Domain: %s\n", genDomain)
				return
			}
		}
	}

	log.Println("❌ No matching input/salt pair found in the given range.")
}
