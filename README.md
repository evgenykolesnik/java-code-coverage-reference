# Java Code Coverage

## Unit test coverage

```bash
mvn test
```

The jacoco plugin measure the coverage and report it to the `target/jacoco.exec`.

## Run the application

```bash
mvn spring-boot:run
```

It will run the application on `localhost:8080`.

## Integration test coverage

```bash
mvn spring-boot:run -Pit-coverage
```

It is necessary to stop the application once the integration testing is done.
It produces the coverage report `target/jacoco-it.exec`.

## Sonar

```bash
mvn sonar:sonar
```

In order to visualize the report it should be uploaded to the sonar server
(it should be available on local machine with default configuration).
