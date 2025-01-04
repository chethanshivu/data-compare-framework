# Data Compare Framework

A Spring Boot application for comparing CSV and Excel files to identify and report mismatches.

## Features

- Support for CSV and Excel file comparisons
- Detailed mismatch reporting
- Column-based comparison configuration
- Export results to multiple formats

## Prerequisites

- Java 17+
- Maven 3.6+
- Spring Boot 3.x

## Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>com.opencsv</groupId>
        <artifactId>opencsv</artifactId>
        <version>5.7.1</version>
    </dependency>
    <dependency>
        <groupId>com.github.ozlerhakan</groupId>
        <artifactId>poiji</artifactId>
        <version>3.1.9</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.30</version>
    </dependency>
</dependencies>
```

## Quick Start

1. Clone the repository
2. Configure comparison settings in `application.yml`
3. Run using: `mvn spring-boot:run`

## Configuration

```yaml
compare:
  source:
    path: /path/to/source.csv
    type: CSV
  target:
    path: /path/to/target.xlsx
    type: EXCEL
  keys: ["id", "accountNumber"]
  ignore-columns: ["lastModifiedDate"]
```

## Usage

```java
@Autowired
private DataCompareService compareService;

ComparisonResult result = compareService.compare(sourceFile, targetFile);
Report report = reportGenerator.generate(result);
```

## Output

The framework generates reports containing:
- Summary statistics
- Detailed mismatch records
- Column-level differences
- Validation errors

## Contributing

1. Fork the repository
2. Create feature branch
3. Submit pull request

## License

MIT License

## Support

For issues and questions, please create a GitHub issue.
