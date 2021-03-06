/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

/**
 *
 * @author acer
 */
public class Asisten extends Orang {

    private String id_asisten;
    private TugasBesar[] tugasbesar;
    private int nTubes = 0;
    private int maxTubes;

    public Asisten(String nama, String alamat, long noHP, String jenisKelamin) {
        super(nama, alamat, noHP, jenisKelamin);
        tugasbesar = new TugasBesar[12];

    }

    public Asisten(String nama, String alamat, long noHP, String jenisKelamin, int maxTubes) {
        super(nama, alamat, noHP, jenisKelamin);
        tugasbesar = new TugasBesar[maxTubes];

    }

    public void setId_asisten(String id_asisten) {
        this.id_asisten = id_asisten;
    }

    public String getId_asisten() {
        return id_asisten;
    }

    public void createTugasBesar(String judul) {
        if (nTubes < tugasbesar.length) {
            tugasbesar[nTubes] = new TugasBesar(judul);
            nTubes++;
        } else {
            System.out.println("Maaf, tugas besar sudah penuh");
        }
    }

    public void createTugasBesar(String judul, int maxTubes) {
        if (nTubes < tugasbesar.length) {
            tugasbesar[nTubes] = new TugasBesar(judul, maxTubes);
            nTubes++;
        } else {
            System.out.println("Maaf, tugas besar sudah penuh");
        }
    }

    public TugasBesar getTugasBesar(int i) {
        return tugasbesar[i];
    }

    public void removeTugasBesar(int x) {
        if ((x < tugasbesar.length) && (x >= 0)) {
            System.out.print("Tubes dengan judul " + tugasbesar[x].getJudul() + " berhasil dihapus");
            tugasbesar[x] = null;
            for (int y = x; x < tugasbesar.length; x++) {
                tugasbesar[x] = tugasbesar[x + 1];
            }
            nTubes--;
        } else {
            System.out.println("Tugas besar tidak dapat dihapus");
        }

    }

    public int getMaxTubes() {
        return maxTubes;
    }

    public int getnTubes() {
        return nTubes;
    }
}
