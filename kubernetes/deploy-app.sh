#! /bin/bash

echo "Deleting existing components:"
echo "--Executing: kubectl delete all --all"
kubectl delete all --all

echo "Creating Config Map"
echo "--Executing: kubectl apply -f ./students-config.yaml"
kubectl apply -f ./students-config.yaml

echo "Creating Secret"
echo "--Executing: kubectl apply -f ./students-secret.yaml"
kubectl apply -f ./students-secret.yaml

echo "Creating Database pod"
echo "--Executing: kubectl apply -f ./students-db.yaml"
kubectl  apply -f ./students-db.yaml

echo "Creating Application pod"
echo "--Executing: kubectl apply -f ./students-api-server.yaml"
kubectl apply -f ./students-api-server.yaml

