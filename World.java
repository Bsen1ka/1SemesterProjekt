/* World class for modeling the entire in-game world
 */

class World {
  Space entry;
  
  World () {
    Space entry    = new Space("gang");
    Space gang = new Space("gang");
    Space klasselokale = new Space("klasselokale");
    Space klasselokaleUnderEtagen = new Space("klasselokale");
    Space underetagen = new Space("underetagen");
    Space udenfor  = new Space("udenfor");
    
    entry.addEdge("klasselokale", klasselokale);
    entry.addEdge("underetagen", underetagen);
    entry.addEdge("gang",gang);
    gang.addEdge("klasselokale", klasselokale);
    gang.addEdge("underetagen",underetagen);
    klasselokale.addEdge("gang", gang);
    klasselokaleUnderEtagen.addEdge("udenfor", udenfor);
    underetagen.addEdge("klasselokaleunderetagen", klasselokaleUnderEtagen);
    underetagen.addEdge("gang", gang);
    underetagen.addEdge("udenfor", udenfor);

    
    this.entry = entry;
  }
  
  Space getEntry () {
    return entry;
  }
}

