package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  // Atributo:
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void addLivro(String titulo, String autor, int anoPub) {
    livroList.add(new Livro(titulo, autor, anoPub));
  }

  public List<Livro> pesquisarAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livroIntervaloAno = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if(l.getAnoPub() >= anoFinal && l.getAnoPub() <= anoFinal) {
          livroIntervaloAno.add(l);
        }
      }
    }
    return livroIntervaloAno;
  }
  public Livro pesquisaPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

}
