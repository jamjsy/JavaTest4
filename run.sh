sh rm.sh

mvn clean package
cp target/JavaTest4.jar docker/java/JavaTest4.jar


cd docker 
cd java
sh build.sh
cd ..
cd mysql
sh build.sh
cd ..
cd ..
docker-compose up -d

echo "请稍作等待"
sleep 15
docker logs myjava
