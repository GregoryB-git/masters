package internal

// hashCore charset and length (exactly from JS)
const HashCore = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_."
const HashCoreLength = len(HashCore)

// internalRoutine TLD list for indexing (example list)
var InternalRoutine = []string{
	"com",
	"net",
	"org",
	"xyz",
	"info",
	"io",
	"biz",
	"co",
	"us",
	"app",
}

// Default modulo constant for validation (adjust as needed)
const DefaultConst = 37
