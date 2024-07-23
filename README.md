# Webscraper and Kafka Integration with REST API Service

## Overview

This project consists of a Java application that scrapes product data from the website, sends the data to a Kafka topic, consumes the data from the Kafka topic, and provides a REST API to serve the data stored in a JSON file.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Building and Running](#building-and-running)
- [Using Docker](#using-docker)
- [API Endpoints](#api-endpoints)

## Prerequisites

- Java 22
- Apache Maven
- Apache Kafka
- Docker 

## Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/webscraper.git
    cd webscraper
    ```

2. **Install dependencies**:
    ```sh
    mvn clean install
    ```

## Building and Running

### 1. Run Kafka

Ensure that Kafka is running locally. You can follow the [Kafka Quickstart Guide](https://kafka.apache.org/quickstart) for setup instructions.

### 2. Scrape Data and Send to Kafka

You can run the application in two modes: `producer` and `consumer`.

- **Run the Producer**:
    ```sh
    java -jar target/webscraper-1.0-SNAPSHOT.jar producer
    ```

- **Run the Consumer**:
    ```sh
    java -jar target/webscraper-1.0-SNAPSHOT.jar consumer
    ```

### 3. Run the Spring Boot Application

Ensure you have `data.json` in the `src/main/resources` directory.

- **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

### Using Docker

1. **Build the Docker Image**:
    ```sh
    docker build -t webscraper:latest .
    ```

2. **Run the Docker Container**:
    ```sh
    docker run -p 8080:8080 webscraper:latest
    ```

## API Endpoints

### GET /api/data

Fetch the scraped data stored in `data.json`.

- **URL**: `http://localhost:8080/api/data`
- **Method**: `GET`
- **Response**: JSON array of product data


