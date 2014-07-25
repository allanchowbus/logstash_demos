@Grab('log4j:log4j:1.2.17')

import org.apache.log4j.*
import org.apache.log4j.net.*
import groovy.util.logging.*

@Log4j
class LogSpewer{

   def spew() {

      def d = { randomNumber -> log.debug 'DEBUGGING MESSAGE VALUE = ' + randomNumber }
      def i = { randomNumber -> log.info 'INFO MESSAGE VALUE = ' + randomNumber }
      def w = { randomNumber -> log.warning 'WARNING MESSAGE VALUE = ' + randomNumber }
      def e = { randomNumber -> log.error 'ERROR MESSAGE VALUE = ' + randomNumber }

      def messages = [d, i, w, e]

      log.level = Level.ALL

      log.addAppender(new SocketAppender("localhost", 4560))
      
      def random_number = new Random().nextInt(messages.size())

      messages[random_number].call(random_number)
   }
}

def log_spewer = new LogSpewer()
log_spewer.spew()
