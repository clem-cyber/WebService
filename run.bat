protoc --plugin="./lib/protoc-gen-grpc-java-1.56.0-windows-x86_64.exe" --java_out=./src/main/java/ --proto_path=./src/main/proto/ hotel.proto
mvn clean install