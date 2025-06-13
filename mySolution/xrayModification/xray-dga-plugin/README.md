# 🔐 XRay DGA Plugin (Go)

Deterministic Domain Generation Algorithm (DGA) implemented in Go. It mimics a JavaScript-based DGA using SHA-256 hashing, base64-like encoding, and a fixed TLD list.

---

## 🧱 Project Structure

```text
xray-dga-plugin/
├── cmd/
│   ├── dga/         # Main CLI: generate a domain from input + salt
│   ├── geninput/    # Find valid input values that pass the modulo check
│   └── reverse/     # Reverse a generated domain to possible input + salt
├── internal/        # Core logic and helpers
│   ├── encoder.go      # SHA256 hashing, encode/decode, domain generation
│   ├── constants.go     # Constants: hash charset, TLDs, default values
│   └── generator.go
├── bin/             # Compiled binaries
├── go.mod
└── README.md


## Build
go build -o bin/dga ./cmd/dga/
go build -o bin/geninput ./cmd/geninput/
go build -o bin/reverse ./cmd/reverse/


## Usage
1. Generate domain
./bin/dga -input b -salt mysalt

2. Find Valid Inputs (with modulo==1)
./bin/geninput -count 3 -json -regex ".*\\.xyz$" -out results.jsonl

3. Reverse lookup
./bin/reverse -domain 7b58e25d8e7dd26f33.xyz -salt mysalt
./bin/reverse -domain 65cbe4c8548a3eeb6d.xyz -salt-start 0 -salt-end 500 --json

example output:
{
  "input": "b",
  "decoded": 1,
  "salt": "mysalt",
  "domain": "7b58e25d8e7dd26f33.xyz"
}

## Key concepts


    SHA-256 Hashing: Generates deterministic values from input + salt.

    Custom Encoding: 64-character set (alphanumeric + -_), like Base64.

    Modulo Check: Ensures selected inputs pass a fixed modular rule.

    Determinism: Same input and salt always generate the same domain.





