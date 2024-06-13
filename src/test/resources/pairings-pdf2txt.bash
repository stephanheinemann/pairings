#!/bin/bash

for i in ./pdfpairings/*.pdf; do
    [ -f "$i" ] || break;
    echo "converting \"$i\" to \"${i%.*}.txt\" ...";
    pdf2txt -W 0.5 "$i" | col -bx | tr -s ' '> "${i%.*}.txt";
done

mv pdfpairings/*.txt txtpairings/
