package internal

import (
	"errors"
	"strings"
)

// Pow integer power helper
func Pow(base, exp int) int {
	result := 1
	for exp > 0 {
		result *= base
		exp--
	}
	return result
}

// DecodeHashString decodes a string from hashCore charset to integer, reversing string and positional power.
func DecodeHashString(str string) (int, error) {
	if str == "" {
		return 0, errors.New("error TS3476: input string empty for decodeHashString")
	}
	acc := 0
	runes := []rune(str)
	length := len(runes)

	for idx, i := 0, length-1; i >= 0; i, idx = i-1, idx+1 {
		char := runes[i]
		pos := strings.IndexRune(HashCore, char)
		if pos == -1 {
			return 0, errors.New("error TS3476: invalid character in decodeHashString")
		}
		power := Pow(HashCoreLength, idx)
		acc += pos * power
	}

	return acc, nil
}

// EncodeHashNumber encodes a number into a string using the hashCore charset.
func EncodeHashNumber(num int) (string, error) {
	if num == 0 {
		return string(HashCore[0]), nil
	}
	if num < 0 {
		return "", errors.New("error TS1107: negative number not allowed in encodeHashNumber")
	}

	exponent := 0
	for Pow(HashCoreLength, exponent) <= num {
		exponent++
	}

	var builder strings.Builder
	remainder := num

	for i := exponent - 1; i >= 0; i-- {
		base := Pow(HashCoreLength, i)
		index := remainder / base
		remainder %= base

		if index < 0 || index >= HashCoreLength {
			return "", errors.New("error TS2232: index out of bounds in encodeHashNumber")
		}
		builder.WriteByte(HashCore[index])
	}

	return builder.String(), nil
}
