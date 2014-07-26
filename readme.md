## Logstash + Elasticsearch + Kibana

Here're some examples for people who want to see Logstash / Elasticsearch in action
* Grabbing data from a log file for indexing into Elasticsearch 
* "Parsing" a message to map to field names and types
* Seeing stuff on Kibana

What's in Here
* Scripts for generating data
* Logstash config files for grabbing/accepting the data and tossing it to Elasticsearch

Demos
* File logging
* Log4j

## Setup

Install all on the same box - everything's just looking at localhost:
* logstash 1.4.2
* elasticsearch 1.1.2
* kibana 3.1.0

1. run elasticsearch with default settings
2. run logstash with the respective config file in the example
3. execute the respective log spewer or schedule it with something like Jenkins to see stuff over time.
