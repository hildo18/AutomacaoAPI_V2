package dataFactory;


import pojo.PostagemPojo;

public class PostagemDataFactory {
    public static PostagemPojo criarPostagemValida(){
        PostagemPojo postagem;
        postagem = new PostagemPojo();
        postagem.setBody("teste  xpto");
        postagem.setTitle("teste hildo");
        postagem.setId(444);
        postagem.setUserId(123);

        return postagem;
    }

    public static PostagemPojo criarPostagemDadosFormatoInvalido(){
        PostagemPojo postagem;
        postagem = new PostagemPojo();
        postagem.setBody("teste  xpto");
        postagem.setId(444);
        postagem.setUserId(123);

        return postagem;
    }
}
