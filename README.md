# SwingEDTCheckAgent

Simple agent to check if swing object methods are use in other threads than EventDispatcherThread

## Compile
`./gradlew shadowJar`

## Usage

To print stack trace only:

`java -javaagent:<path to>/SwingEDTCheckAgent-all.jar <rest of the arguments>`

To throw exception:

`java -javaagent:<path to>/SwingEDTCheckAgent-all.jar=throw <rest of the arguments>`
