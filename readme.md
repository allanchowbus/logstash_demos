## Logstash + Elasticsearch + Kibana

Here're some examples for people who want to see Logstash / Elasticsearch in action
* Grabbing data from a log file for indexing into Elasticsearch 
* "Parsing" a message to map to field names and types
* Seeing stuff on Kibana

What's in Here
* Scripts for generating data
* Logstash config files for grabbing/accepting the data and tossing it to Elasticsearch
* Kibana Dashboard Configs to show some queries and graphs

Demos
* File logging
* Log4j

## Setup

Install all on the same box - everything's just looking at localhost:
* logstash 1.4.2 - http://logstash.net/docs/1.4.2/
* elasticsearch 1.1.2
* kibana 3.1.0

1. Read through this guy and become familiar:  http://logstash.net/docs/1.4.2/tutorials/getting-started-with-logstash
2. run elasticsearch with default settings
3. run logstash with the respective config file in the example
4. execute the respective log spewer or schedule it with something like Jenkins to see stuff over time.
5. Run kibana - quick way:
`python -m SimpleHTTPServer 8000`
6. load respective dashboard for the Demo
