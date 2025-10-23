🎵 Aplicação de Áudios – Java
Sobre o Projeto

Projeto prático em Java para aplicar conceitos de Programação Orientada a Objetos (POO): encapsulamento, herança e polimorfismo. A aplicação simula um reprodutor de áudios, incluindo músicas e podcasts, permitindo gerenciar reproduções, curtidas e classificações de forma organizada.

Funcionalidades

Superclasse Audio com atributos:

titulo

duracao

totalReproducoes

curtidas

classificacao

Métodos encapsulados para:

Curtir (curtir())

Reproduzir (reproduzir())

Calcular classificação

Subclasses:

Musica

Podcast

Controle de favoritos e reproduções via classe de gerenciamento (Playlist ou similar)

Garantia de encapsulamento, impedindo acesso direto aos atributos da classe Principal.

Estrutura do Projeto
Audio
 ├── Musica
 └── Podcast
Playlist (ou Reprodutor)
Principal (main)

Tecnologias

Java 17+

IDE: IntelliJ IDEA ou similar

Objetivo

Praticar pilares da POO:

Encapsulamento: proteger atributos com métodos públicos

Herança: criar especializações de Audio

Polimorfismo: tratar diferentes tipos de áudio de forma uniforme

Desenvolver uma aplicação funcional, modular e organizada.
