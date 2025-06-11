package main

import (
	"flag"
	"fmt"
	"log"
	"os"

	"xraydga/internal"
)

func main() {
	input := flag.String("input", "", "Input string for domain generation (required)")
	salt := flag.String("salt", "", "Salt string for domain generation (required)")
	flag.Parse()

	if *input == "" || *salt == "" {
		fmt.Fprintf(os.Stderr, "Error: both -input and -salt flags are required\n\n")
		flag.Usage()
		os.Exit(1)
	}

	domain, err := internal.CheckAndGenerate(*input, *salt)
	if err != nil {
		log.Fatalf("Domain generation failed: %v\n", err)
	}

	fmt.Println("Final generated domain:", domain)
}
