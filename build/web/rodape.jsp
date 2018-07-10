<!-- INSERINDO UMA FAIXA CINZA-->
<div  class="fundoCinza20px">

</div>

<!-- INSERINDO OS CARDS DE ENDEREÇO E CONTATO-->
<div  class="fundoPreto">
    <div class="fundoPreto20px">

    </div>
    <div class="grid-container">
        <div class="grid-x grid-margin-x">
            <div class="cell medium-4">
                <p class="whiteBold"> Nosso Endereço </p>
                <hr>
                <p class = "white"> Avenida 24A, no 1515 </p>
                <p class = "white"> CEP: 13506-900 </p>
                <p class = "white"> Bairro: Bela Vista </p>
                <p class = "white"> Rio Claro - SP </p>
                <p class = "white"> Cx Postal: 178 </p>                            
            </div>
            <div class="cell medium-4">
                <p class="whiteBold"> Atendimento </p>
                <hr>
                <!-- INSERINDO O MODAL DE CONTATO-->                                                                          
                <p> <a data-open="exampleModal1"> <img src="images/rodape/form.png" width="16" height="16" alt="form"/> Serviço de atendimento ao consumidor </a> </p>

                <div class="reveal fundoPreto" id="exampleModal1" data-reveal>
                    <div class="fundoPreto">
                        <h2 class="white"> Contato </h2>
                        <form action="#">
                            <div class="cell small-4">
                                <label class="white">Nome completo: *
                                    <input type="text" placeholder="Digite seu nome completo">
                                </label>
                            </div>
                            <div class="cell small-4">
                                <label class="white">E-mail: *
                                    <input type="email" placeholder="Digite seu e-mail">
                                </label>
                            </div>
                            <div class="cell small-4">
                                <label class="white">Mensagem: *
                                    <textarea placeholder="Digite sua dúvida/sugestão" rows="4"></textarea>
                                </label>
                            </div>
                            <div class="contact-panel-actions">
                                <button class="hollow button alert">Cancelar</button> &nbsp;&nbsp;&nbsp;&nbsp;
                                <button class="hollow button">Enviar</button>                                        
                            </div>
                        </form>
                    </div>
                </div>

                <p class = "white"> <img src="images/rodape/phone.png" width="16" height="16" alt="phone"/> (19) 3333-4444 </p>
                <p class = "white"> <img src="images/rodape/mobile.png" width="16" height="16" alt="mobile"/> (19) 98888-7777 </p>
                <p class = "white"> <img src="images/rodape/email.png" width="16" height="16" alt="email"/> <a href="mailto:sac@cwfullrepair.com">sac@cwfullrepair.com</a> </p>                            
            </div>
            <div class="cell medium-4">
                <p class="whiteBold"> Certificado de Qualidade </p>
                <hr>
                <img src="images/rodape/quality.png" width="256" height="256" alt="quality"/>
            </div>
        </div>
    </div>
    <!-- INSERINDO O MODAL ANIMADO DE DESENVOLVIMENTO COMO FINAL DE PÁGINA -->
    <div  class="fundoPreto">
        <div class="grid-container">
            <div class="grid-x grid-margin-x">
                <div class="cell medium-12 align-middle">

                    <p> <a data-toggle="animatedModal10"> Desenvolvimento </a> </p>

                    <div class="reveal" id="animatedModal10" data-reveal data-close-on-click="true" data-animation-in="spin-in" data-animation-out="spin-out">
                        <h1>Site desenvolvido por:</h1>
                        <p class="lead">Prof. Frank J. Affonso </p>
                        <p class="lead">Disciplina Sistemas Orientados a Objetos </p>
                        <button class="close-button" data-close aria-label="Close reveal" type="button">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <!-- INSERINDO O PAINEL DE CONTATO FINAL DE PÁGINA-->
    <div class="contact-panel" id="contact-panel" data-toggler=".is-active">            
        <a class="contact-panel-button" data-toggle="contact-panel"> <img src="images/rodape/form.png" width="16" height="16" alt="form"/> &nbsp;&nbsp;&nbsp; Contato </a>
        <form action="#">
            <div class="cell small-4">
                <label>Nome completo: *
                    <input type="text" placeholder="Digite seu nome completo">
                </label>
            </div>
            <div class="cell small-4">
                <label>E-mail: *
                    <input type="email" placeholder="Digite seu e-mail">
                </label>
            </div>
            <div class="cell small-4">
                <label>Mensagem: *
                    <textarea placeholder="Digite sua dúvida/sugestão" rows="4"></textarea>
                </label>
            </div>
            <div class="contact-panel-actions">
                <button class="hollow button alert">Cancelar</button> &nbsp;&nbsp;&nbsp;&nbsp;
                <button class="hollow button">Enviar</button>                                        
            </div>
        </form>
    </div>
</div>