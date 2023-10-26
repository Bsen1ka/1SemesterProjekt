/* World class for modeling the entire in-game world
 */

class World {
  Space entry;

  
  World () {

    String hvdGangMed = "Du står i en situation, hvor en skoleskyder er inde på skolen og skyder på alt der bevæger sig. " + "\n"+
            "Du har evner til at interagere med objekter og gemme dem i din inventory, det vil øge din chance for at komme igennem spillet. " + "\n"+
            "Din opgave er at tage de rigtige beslutninger før tiden løber ud og for at komme ud i god behold og i sikkerhed. ";
    String klsMed = "";
    String gngMed = "Din chance for at overleve på en åben gang er meget lille. Skoleskyderen vil have muligheden for at dukke op og skyde efter dig." + "\n" + "Det er op til dig at finde en udvej og slippe væk fra skyderen. Du har nu muligheden for at fortsætte ned af gangen, gemme dig i et klasselokale eller gå ned af trappen til underetagen. ";
    String kluetMed ="Hi";
    String udenforMed = "Hello";
    String nedenunderMed = "Hey";

    Space entry    = new Space("hovedgang ",hvdGangMed);
    Space gang = new Space("gang ",gngMed);
    Space klasselokale = new Space("klasselokale ",klsMed);
    Space klasselokaleUnderEtagen = new Space("klasselokaleUnderEtagen ", kluetMed);
    Space underetagen = new Space("underetagen ",udenforMed);
    Space udenfor  = new Space("udenfor ",nedenunderMed);

    entry.addEdge("klasselokale", klasselokale);
    entry.addEdge("underetagen", underetagen);
    entry.addEdge("gang",gang);

    gang.addEdge("klasselokale", klasselokale);
    gang.addEdge("underetagen",underetagen);

    klasselokale.addEdge("gang", gang);
    klasselokaleUnderEtagen.addEdge("udenfor", udenfor);

    underetagen.addEdge("klasselokale2", klasselokaleUnderEtagen);
    underetagen.addEdge("gang", gang);
    underetagen.addEdge("udenfor", udenfor);


    this.entry = entry;
  }

  Space getEntry () {
    return entry;
  }


}

