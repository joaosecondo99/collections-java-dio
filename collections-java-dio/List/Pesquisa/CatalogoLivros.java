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

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.addLivro("Livro 1", "Autor 1", 2020);
    catalogoLivros.addLivro("Livro 1", "Autor 2", 2021);
    catalogoLivros.addLivro("Livro 2", "Autor 2", 2022);
    catalogoLivros.addLivro("Livro 3", "Autor 3", 2023);
    catalogoLivros.addLivro("Livro 4", "Autor 4", 1994);

    System.out.println(catalogoLivros.pesquisarAutor("Autor 2"));
    System.out.println(catalogoLivros.pesquisaIntervaloAnos(2020,2022));
    System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
  }
}
