# storez

1- Executar docker-compose up -d para subir o ambiente de kafka. (Comando -d para executar o docker em modo background)

2- Verificar os container subidos
   
   docker-compose ps
  
   Debe ser visualizados kafka e zookeeper

3- Verificando o kafka e zookeeper
   
  docker-compose logs zookeeper | grep -i binding
  docker-compose logs kafka | grep -i started
