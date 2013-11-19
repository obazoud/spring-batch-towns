#!/bin/bash

rm -f {depart*,town*}.xml
unzip towns-raw.zip

cat departement.xml | sed -r "s/<column name=\"(.*)\">(.*)<\/column>/<\1>\2<\/\1>/g" | sed -r "s/<table name=\"(.*)\">/<\1>/g" | sed -r "s/departement_//g" | sed -r "s/<\/table>/<\/departement>/g" > departments.xml

cat villes_france.xml | sed -r "s/<column name=\"(.*)\">(.*)<\/column>/<\1>\2<\/\1>/g" | sed -r "s/<table name=\"(.*)\">/<\1>/g" | sed -r "s/ville_//g" | sed -r "s/villes_france/town/g" | sed -r "s/<\/table>/<\/town>/g" > towns.xml

rm departement.xml
rm villes_france.xml