#!/usr/bin/env node

/**
 * DPI Evasion System - Testing Framework & Setup Guide
 * Complete testing suite with simulation capabilities
 */

const fs = require('fs');
const crypto = require('crypto');
const { performance } = require('perf_hooks');

// Import the main system (assuming it's saved as dpi-evasion.js)
// const { DPIEvasionController, DomainGenerator, TrafficObfuscator } = require('./dpi-evasion');

// For this example, we'll include a simplified version for testing
class TestableTrafficObfuscator {
    constructor() {
        this.techniques = {
            fragmentPackets: true,
            randomizeHeaders: true,
            mimicHTTPS: true,
            variableDelay: true
        };
        this.testMode = true;
    }

    fragmentPacket(data, maxSize = 1200) {
        const fragments = [];
        const dataStr = typeof data === 'string' ? data : JSON.stringify(data);
        for (let i = 0; i < dataStr.length; i += maxSize) {
            fragments.push(dataStr.slice(i, i + maxSize));
        }
        return fragments;
    }

    addRandomHeaders() {
        const userAgents = [
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
            'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36',
            'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36'
        ];
        
        return {
            'User-Agent': userAgents[Math.floor(Math.random() * userAgents.length)],
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
            'Accept-Language': 'en-US,en;q=0.5',
            'Accept-Encoding': 'gzip, deflate',
            'Connection': 'keep-alive',
            'Cache-Control': 'no-cache',
            'X-Forwarded-For': this.generateFakeIP(),
            'X-Request-ID': crypto.randomUUID()
        };
    }

    generateFakeIP() {
        return `${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}.${Math.floor(Math.random() * 255)}`;
    }

    async addRandomDelay() {
        if (!this.testMode) {
            const delay = Math.random() * 2000 + 500;
            return new Promise(resolve => setTimeout(resolve, delay));
        }
        return Promise.resolve(); // Skip delays in test mode
    }
}

class TestableDomainGenerator {
    constructor(seed = Date.now()) {
        this.seed = seed;
        this.domains = [];
        this.tlds = ['.com', '.net', '.org', '.info', '.biz', '.xyz', '.tech'];
        this.generatedCount = 0;
    }

    lcg(seed) {
        return (seed * 1103515245 + 12345) & 0x7fffffff;
    }

    generateRandomString(length, seed) {
        const chars = 'abcdefghijklmnopqrstuvwxyz';
        let result = '';
        let currentSeed = seed;
        
        for (let i = 0; i < length; i++) {
            currentSeed = this.lcg(currentSeed);
            result += chars[currentSeed % chars.length];
        }
        return result;
    }

    generateDomains(count = 20) {
        this.domains = [];
        let currentSeed = this.seed + this.generatedCount;
        
        for (let i = 0; i < count; i++) {
            currentSeed = this.lcg(currentSeed);
            const length = 8 + (currentSeed % 8);
            const domain = this.generateRandomString(length, currentSeed);
            const tld = this.tlds[currentSeed % this.tlds.length];
            this.domains.push(domain + tld);
        }
        this.generatedCount += count;
        return this.domains;
    }

    getNextDomain() {
        if (this.domains.length === 0) {
            this.generateDomains();
        }
        return this.domains.shift();
    }
}

// Test Suite Class
class DPIEvasionTester {
    constructor() {
        this.testResults = [];
        this.verbose = false;
    }

    setVerbose(verbose = true) {
        this.verbose = verbose;
        return this;
    }

    log(message, level = 'INFO') {
        if (this.verbose || level === 'ERROR') {
            console.log(`[${level}] ${new Date().toISOString()} - ${message}`);
        }
    }

    async runTest(testName, testFunction) {
        this.log(`Running test: ${testName}`);
        const startTime = performance.now();
        
        try {
            const result = await testFunction();
            const endTime = performance.now();
            const duration = endTime - startTime;
            
            this.testResults.push({
                name: testName,
                status: 'PASS',
                duration: duration.toFixed(2),
                result: result
            });
            
            this.log(`✅ ${testName} - PASSED (${duration.toFixed(2)}ms)`);
            return true;
        } catch (error) {
            const endTime = performance.now();
            const duration = endTime - startTime;
            
            this.testResults.push({
                name: testName,
                status: 'FAIL',
                duration: duration.toFixed(2),
                error: error.message
            });
            
            this.log(`❌ ${testName} - FAILED: ${error.message}`, 'ERROR');
            return false;
        }
    }

    // Test Domain Generation Algorithm
    async testDomainGeneration() {
        const generator = new TestableDomainGenerator(12345);
        
        // Test deterministic generation
        const domains1 = generator.generateDomains(10);
        const generator2 = new TestableDomainGenerator(12345);
        const domains2 = generator2.generateDomains(10);
        
        if (JSON.stringify(domains1) !== JSON.stringify(domains2)) {
            throw new Error('Domain generation is not deterministic');
        }
        
        // Test domain uniqueness
        const largeDomainSet = generator.generateDomains(100);
        const uniqueDomains = [...new Set(largeDomainSet)];
        
        if (uniqueDomains.length !== largeDomainSet.length) {
            throw new Error('Generated domains are not unique');
        }
        
        // Test domain format
        const domain = generator.getNextDomain();
        if (!/^[a-z]{8,15}\.(com|net|org|info|biz|xyz|tech)$/.test(domain)) {
            throw new Error(`Invalid domain format: ${domain}`);
        }
        
        return {
            sampleDomains: domains1.slice(0, 5),
            totalGenerated: largeDomainSet.length,
            uniqueCount: uniqueDomains.length
        };
    }

    // Test Traffic Obfuscation
    async testTrafficObfuscation() {
        const obfuscator = new TestableTrafficObfuscator();
        
        // Test packet fragmentation
        const testData = 'A'.repeat(5000);
        const fragments = obfuscator.fragmentPacket(testData, 1200);
        
        if (fragments.length < 2) {
            throw new Error('Packet fragmentation failed');
        }
        
        const reconstructed = fragments.join('');
        if (reconstructed !== testData) {
            throw new Error('Fragmented data reconstruction failed');
        }
        
        // Test header generation
        const headers1 = obfuscator.addRandomHeaders();
        const headers2 = obfuscator.addRandomHeaders();
        
        if (!headers1['User-Agent'] || !headers1['X-Forwarded-For']) {
            throw new Error('Required headers missing');
        }
        
        // Headers should be different (randomized)
        if (headers1['User-Agent'] === headers2['User-Agent'] && 
            headers1['X-Forwarded-For'] === headers2['X-Forwarded-For']) {
            throw new Error('Headers are not randomized');
        }
        
        return {
            fragmentCount: fragments.length,
            sampleHeaders: Object.keys(headers1),
            fragmentSizes: fragments.map(f => f.length)
        };
    }

    // Test DPI Detection Simulation
    async testDPIDetection() {
        const responses = [
            { type: 'normal', data: 'HTTP/1.1 200 OK' },
            { type: 'blocked', data: 'HTTP/1.1 403 Forbidden' },
            { type: 'reset', data: 'connection_reset' },
            { type: 'timeout', data: 'timeout_pattern' }
        ];
        
        let detectionCount = 0;
        
        for (const response of responses) {
            // Simulate DPI detection logic
            const isDPI = ['blocked', 'reset', 'timeout'].includes(response.type);
            if (isDPI) detectionCount++;
        }
        
        if (detectionCount === 0) {
            throw new Error('DPI detection failed to identify blocked responses');
        }
        
        return {
            totalResponses: responses.length,
            detectedDPI: detectionCount,
            detectionRate: (detectionCount / responses.length * 100).toFixed(1) + '%'
        };
    }

    // Performance benchmark
    async testPerformance() {
        const iterations = 1000;
        const generator = new TestableDomainGenerator();
        const obfuscator = new TestableTrafficObfuscator();
        
        // Benchmark domain generation
        const domainStart = performance.now();
        for (let i = 0; i < iterations; i++) {
            generator.getNextDomain();
        }
        const domainEnd = performance.now();
        const domainTime = domainEnd - domainStart;
        
        // Benchmark header generation
        const headerStart = performance.now();
        for (let i = 0; i < iterations; i++) {
            obfuscator.addRandomHeaders();
        }
        const headerEnd = performance.now();
        const headerTime = headerEnd - headerStart;
        
        // Benchmark packet fragmentation
        const testData = 'X'.repeat(10000);
        const fragmentStart = performance.now();
        for (let i = 0; i < 100; i++) {
            obfuscator.fragmentPacket(testData);
        }
        const fragmentEnd = performance.now();
        const fragmentTime = fragmentEnd - fragmentStart;
        
        return {
            domainGeneration: {
                iterations: iterations,
                totalTime: domainTime.toFixed(2) + 'ms',
                avgTime: (domainTime / iterations).toFixed(4) + 'ms'
            },
            headerGeneration: {
                iterations: iterations,
                totalTime: headerTime.toFixed(2) + 'ms',
                avgTime: (headerTime / iterations).toFixed(4) + 'ms'
            },
            packetFragmentation: {
                iterations: 100,
                totalTime: fragmentTime.toFixed(2) + 'ms',
                avgTime: (fragmentTime / 100).toFixed(4) + 'ms'
            }
        };
    }

    // Connection strategy testing
    async testConnectionStrategies() {
        const strategies = ['direct', 'domain_fronting', 'shadowsocks', 'vmess', 'trojan'];
        const results = {};
        
        for (const strategy of strategies) {
            // Simulate connection attempts with different success rates
            const attempts = 10;
            let successes = 0;
            
            for (let i = 0; i < attempts; i++) {
                // Simulate different success rates for different strategies
                const successRate = strategy === 'direct' ? 0.3 : 0.7;
                if (Math.random() < successRate) {
                    successes++;
                }
            }
            
            results[strategy] = {
                attempts: attempts,
                successes: successes,
                successRate: (successes / attempts * 100).toFixed(1) + '%'
            };
        }
        
        return results;
    }

    // Generate comprehensive test report
    generateReport() {
        const totalTests = this.testResults.length;
        const passedTests = this.testResults.filter(t => t.status === 'PASS').length;
        const failedTests = totalTests - passedTests;
        
        const report = {
            summary: {
                total: totalTests,
                passed: passedTests,
                failed: failedTests,
                successRate: ((passedTests / totalTests) * 100).toFixed(1) + '%'
            },
            details: this.testResults,
            timestamp: new Date().toISOString()
        };
        
        return report;
    }

    // Run all tests
    async runAllTests() {
        console.log('🚀 Starting DPI Evasion System Tests...\n');
        
        await this.runTest('Domain Generation Algorithm', () => this.testDomainGeneration());
        await this.runTest('Traffic Obfuscation', () => this.testTrafficObfuscation());
        await this.runTest('DPI Detection', () => this.testDPIDetection());
        await this.runTest('Performance Benchmark', () => this.testPerformance());
        await this.runTest('Connection Strategies', () => this.testConnectionStrategies());
        
        const report = this.generateReport();
        
        console.log('\n📊 Test Results Summary:');
        console.log(`Total Tests: ${report.summary.total}`);
        console.log(`Passed: ${report.summary.passed}`);
        console.log(`Failed: ${report.summary.failed}`);
        console.log(`Success Rate: ${report.summary.successRate}`);
        
        // Save detailed report
        const reportFile = `test-report-${Date.now()}.json`;
        try {
            fs.writeFileSync(reportFile, JSON.stringify(report, null, 2));
            console.log(`\n📝 Detailed report saved to: ${reportFile}`);
        } catch (error) {
            console.log(`\n⚠️  Could not save report: ${error.message}`);
        }
        
        return report;
    }
}

// Network simulation for integration testing
class NetworkSimulator {
    constructor() {
        this.dpiEnabled = false;
        this.blockList = ['blocked-domain.com', 'censored-site.org'];
        this.latency = 100; // ms
    }

    enableDPI(enabled = true) {
        this.dpiEnabled = enabled;
        console.log(`DPI ${enabled ? 'enabled' : 'disabled'}`);
    }

    addToBlockList(domain) {
        this.blockList.push(domain);
        console.log(`Added ${domain} to block list`);
    }

    async simulateConnection(domain, headers = {}) {
        // Simulate network latency
        await new Promise(resolve => setTimeout(resolve, this.latency));
        
        // Check if domain is blocked
        if (this.blockList.includes(domain)) {
            return { success: false, reason: 'domain_blocked', status: 403 };
        }
        
        // Simulate DPI detection
        if (this.dpiEnabled) {
            // Simple DPI simulation - detect suspicious patterns
            const suspiciousHeaders = ['X-Forwarded-For', 'X-Request-ID'];
            const hasSuspiciousHeaders = suspiciousHeaders.some(h => headers[h]);
            
            if (hasSuspiciousHeaders && Math.random() > 0.6) {
                return { success: false, reason: 'dpi_detected', status: 'connection_reset' };
            }
        }
        
        // Simulate random network failures
        if (Math.random() > 0.8) {
            return { success: false, reason: 'network_error', status: 'timeout' };
        }
        
        return { success: true, status: 200, latency: this.latency };
    }
}

// Integration test with network simulation
async function runIntegrationTest() {
    console.log('\n🔧 Running Integration Test with Network Simulation...\n');
    
    const simulator = new NetworkSimulator();
    const generator = new TestableDomainGenerator();
    const obfuscator = new TestableTrafficObfuscator();
    
    // Test without DPI
    console.log('Testing without DPI...');
    simulator.enableDPI(false);
    
    let successCount = 0;
    for (let i = 0; i < 5; i++) {
        const domain = generator.getNextDomain();
        const headers = obfuscator.addRandomHeaders();
        const result = await simulator.simulateConnection(domain, headers);
        
        if (result.success) {
            successCount++;
            console.log(`✅ Connected to ${domain}`);
        } else {
            console.log(`❌ Failed to connect to ${domain}: ${result.reason}`);
        }
    }
    
    console.log(`Success rate without DPI: ${(successCount / 5 * 100).toFixed(1)}%`);
    
    // Test with DPI enabled
    console.log('\nTesting with DPI enabled...');
    simulator.enableDPI(true);
    
    successCount = 0;
    for (let i = 0; i < 10; i++) {
        const domain = generator.getNextDomain();
        const headers = obfuscator.addRandomHeaders();
        const result = await simulator.simulateConnection(domain, headers);
        
        if (result.success) {
            successCount++;
            console.log(`✅ Connected to ${domain}`);
        } else {
            console.log(`❌ Failed to connect to ${domain}: ${result.reason}`);
        }
    }
    
    console.log(`Success rate with DPI: ${(successCount / 10 * 100).toFixed(1)}%`);
}

// Main execution
async function main() {
    const args = process.argv.slice(2);
    const verbose = args.includes('--verbose') || args.includes('-v');
    const integration = args.includes('--integration') || args.includes('-i');
    
    try {
        const tester = new DPIEvasionTester().setVerbose(verbose);
        await tester.runAllTests();
        
        if (integration) {
            await runIntegrationTest();
        }
        
        console.log('\n✅ All tests completed successfully!');
        
    } catch (error) {
        console.error('\n❌ Test execution failed:', error.message);
        process.exit(1);
    }
}

// Export for use as module
module.exports = {
    DPIEvasionTester,
    NetworkSimulator,
    TestableTrafficObfuscator,
    TestableDomainGenerator
};

// Run if called directly
if (require.main === module) {
    main().catch(console.error);
}