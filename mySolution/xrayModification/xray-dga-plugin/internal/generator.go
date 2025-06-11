package internal

import (
	"crypto/sha256"
	"encoding/hex"
	"errors"
	"fmt"
	"strconv"
)

// GenerateDomainFromString hashes input, slices to get domain label and TLD
func GenerateDomainFromString(input string) (name string, tld string, domain string, err error) {
	hashBytes := sha256.Sum256([]byte(input))
	hashHex := hex.EncodeToString(hashBytes[:])

	if len(hashHex) < 22 {
		err = fmt.Errorf("hash length too short: %d", len(hashHex))
		return
	}

	name = hashHex[:18]

	tldHex := hashHex[18:22]

	tldIndex64, err2 := strconv.ParseInt(tldHex, 16, 64)
	if err2 != nil {
		err = fmt.Errorf("failed to parse tld index: %w", err2)
		return
	}
	tldIndex := int(tldIndex64) % len(InternalRoutine)
	tld = InternalRoutine[tldIndex]

	domain = fmt.Sprintf("%s.%s", name, tld)
	return
}

// GetModuloConstant decodes input string and mods by DefaultConst
func GetModuloConstant(input string) (int, error) {
	val, err := DecodeHashString(input)
	if err != nil {
		return 0, err
	}
	return val % DefaultConst, nil
}

// CheckAndGenerate validates input modulo constant and generates domain from input+salt
func CheckAndGenerate(input, salt string) (string, error) {
	modVal, err := GetModuloConstant(input)
	fmt.Println("DEBUG: Modulo constant is", modVal)
	if err != nil {
		return "", err
	}
	if modVal != 1 {
		return "", errors.New("error TS1293: modulo constant check failed")
	}

	_, _, domain, err := GenerateDomainFromString(input)
	if err != nil {
		return "", err
	}
	fmt.Println("Generated domain:", domain)

	_, _, domain2, err := GenerateDomainFromString(input + salt)
	if err != nil {
		return "", err
	}
	return domain2, nil
}
