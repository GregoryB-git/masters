# DPI Evasion System - Setup & Testing Guide

## Quick Start

### 1. Prerequisites
- Node.js (v14 or higher)
- npm or yarn

### 2. Setup

```bash
# Create project directory
mkdir dpi-evasion-system
cd dpi-evasion-system

# Initialize npm project
npm init -y

# Create package.json with dependencies
cat > package.json << 'EOF'
{
  "name": "dpi-evasion-system",
  "version": "1.0.0",
  "description": "DPI Censorship Evasion Algorithm with Testing Framework",
  "main": "dpi-evasion.js",
  "scripts": {
    "test": "node test-framework.js",
    "test:verbose": "node test-framework.js --verbose",
    "test:integration": "node test-framework.js --integration",
    "test:full": "node test-framework.js --verbose --integration",
    "demo": "node dpi-evasion.js",
    "benchmark": "node -e \"require('./test-framework.js').DPIEvasionTester().testPerformance().then(console.log)\""
  },
  "keywords": ["dpi", "censorship", "evasion", "privacy", "security"],
  "author": "Your Name",
  "license": "MIT",
  "dependencies": {},
  "devDependencies": {
    "mocha": "^10.0.0",
    "chai": "^4.3.0"
  },
  "engines": {
    "node": ">=14.0.0"
  }
}
EOF

# Install dependencies
npm install
```

### 3. Save the Code Files

Save the main DPI evasion code as `dpi-evasion.js` and the testing framework as `test-framework.js` in your project directory.

## Running Tests

### Basic Test Suite
```bash
# Run all tests
npm test

# Run with verbose output
npm run test:verbose

# Run with integration testing
npm run test:integration

# Run full test suite
npm run test:full
```

### Individual Test Commands
```bash
# Quick test
node test-framework.js

# Verbose mode
node test-framework.js --verbose

# With network simulation
node test-framework.js --integration

# Both verbose and integration
node test-framework.js --verbose --integration
```

## Running the Main System

### Demo Mode
```bash
# Run the demonstration
npm run demo
# OR
node dpi-evasion.js
```

### Interactive Testing
```bash
# Start Node.js REPL and test components
node

> const { DPIEvasionController, DomainGenerator, TrafficObfuscator } = require('./dpi-evasion');
> const controller = DPIEvasionController.getInstance();
> controller.establishConnection().then(console.log);
```

## Test Output Examples

### Successful Test Run
```
🚀 Starting DPI Evasion System Tests...

[INFO] 2024-01-15T10:30:00.000Z - Running test: Domain Generation Algorithm
✅ Domain Generation Algorithm - PASSED (2.45ms)

[INFO] 2024-01-15T10:30:00.003Z - Running test: Traffic Obfuscation
✅ Traffic Obfuscation - PASSED (1.89ms)

[INFO] 2024-01-15T10:30:00.005Z - Running test: DPI Detection
✅ DPI Detection - PASSED (0.67ms)

[INFO] 2024-01-15T10:30:00.006Z - Running test: Performance Benchmark
✅ Performance Benchmark - PASSED (45.23ms)

[INFO] 2024-01-15T10:30:00.051Z - Running test: Connection Strategies
✅ Connection Strategies - PASSED (12.34ms)

📊 Test Results Summary:
Total Tests: 5
Passed: 5
Failed: 0
Success Rate: 100.0%

📝 Detailed report saved to: test-report-1705316200000.json
```

### Performance Benchmark Results
```json
{
  "domainGeneration": {
    "iterations": 1000,
    "totalTime": "15.23ms",
    "avgTime": "0.0152ms"
  },
  "headerGeneration": {
    "iterations": 1000,
    "totalTime": "8.45ms",
    "avgTime": "0.0085ms"
  },
  "packetFragmentation": {
    "iterations": 100,
    "totalTime": "12.67ms",
    "avgTime": "0.1267ms"
  }
}
```

## Integration with Outline SDK

### Option 1: Direct Integration
```javascript
// outline-integration.js
const { DPIEvasionController } = require('./dpi-evasion');
const { ShadowsocksConfig } = require('outline-client');

class OutlineDPIIntegration {
    constructor(outlineConfig) {
        this.dpiController = DPIEvasionController.getInstance();
        this.outlineConfig = outlineConfig;
    }

    async connect() {
        // Get obfuscated connection parameters
        const success = await this.dpiController.establishConnection();
        
        if (success) {
            // Apply DPI evasion to Outline connection
            const state = this.dpiController.getState();
            console.log(`Connecting via ${state.currentDomain}`);
            
            // Integrate with Outline SDK here
            return this.establishOutlineConnection();
        }
        
        return false;
    }

    async establishOutlineConnection() {
        // Outline SDK integration logic
        return true;
    }
}
```

### Option 2: Plugin Architecture
```javascript
// outline-plugin.js
const OutlineDPIPlugin = {
    name: 'DPI Evasion Plugin',
    version: '1.0.0',
    
    initialize(outlineClient) {
        const controller = DPIEvasionController.getInstance();
        
        // Hook into Outline's connection events
        outlineClient.on('connection_attempt', async (config) => {
            await controller.establishConnection();
            const headers = controller.obfuscator.addRandomHeaders();
            config.headers = { ...config.headers, ...headers };
        });
        
        return controller;
    }
};
```

## Advanced Testing

### Custom Network Conditions
```javascript
const { NetworkSimulator } = require('./test-framework');

const simulator = new NetworkSimulator();
simulator.enableDPI(true);
simulator.addToBlockList('example.com');

// Test with custom conditions
```

### Load Testing
```bash
# Run multiple instances
for i in {1..10}; do
    node dpi-evasion.js &
done
wait
```

### Memory Profiling
```bash
# Profile memory usage
node --inspect dpi-evasion.js
# Open Chrome DevTools and connect to inspector
```

## Troubleshooting

### Common Issues

1. **Tests Failing on Node.js < 14**
   - Solution: Upgrade to Node.js 14 or higher

2. **Permission Errors**
   - Solution: Run with appropriate permissions or use `sudo` on Unix systems

3. **Network Timeouts in Integration Tests**
   - Solution: Increase timeout values in `NetworkSimulator`

4. **High Memory Usage**
   - Solution: Adjust domain generation batch sizes in `DomainGenerator`

### Debug Mode
```bash
# Enable debug logging
DEBUG=* node dpi-evasion.js

# Or set verbose mode
NODE_ENV=development node test-framework.js --verbose
```

## Production Deployment

### Docker Container
```dockerfile
FROM node:18-alpine
WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production
COPY . .
EXPOSE 3000
CMD ["node", "dpi-evasion.js"]
```

### Environment Variables
```bash
# Set production configuration
export NODE_ENV=production
export DPI_SEED=12345
export DPI_STRATEGIES="shadowsocks,vmess,trojan"
export DPI_DETECTION_THRESHOLD=3
```

## Monitoring & Metrics

The system generates detailed logs and metrics:

- Connection success/failure rates
- DPI detection frequency  
- Strategy effectiveness
- Performance benchmarks
- Network latency measurements

All metrics are saved to JSON report files for analysis.

## Security Notes

- Never log sensitive connection details in production
- Rotate domain generation seeds regularly
- Monitor for new DPI detection patterns
- Keep obfuscation techniques updated

## Next Steps

1. Integrate with actual Outline SDK
2. Add more sophisticated DPI detection
3. Implement machine learning for pattern adaptation
4. Add support for additional protocols
5. Create web-based monitoring dashboard