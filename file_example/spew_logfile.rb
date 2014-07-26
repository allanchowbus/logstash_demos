open('/tmp/logstash_food.out', 'a') { |f|
   f << (rand()*100).round()
   f << "\n"
}
