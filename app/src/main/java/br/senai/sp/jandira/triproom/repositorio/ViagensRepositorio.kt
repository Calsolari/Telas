package br.senai.sp.jandira.triproom.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.modelo.Viagens
import java.time.LocalDate

class ViagensRepositorio {
    @Composable
    fun ListarTodasAsViagens(): List <Viagens> {

        val londres = Viagens(
            id = 1,
            destino = "Londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21)
        )

        val recife = Viagens(
            id = 2,
            destino = "Recife",
            descricao = "Recife, a capital do estado de Pernambuco, no nordeste do Brasil, distingue-se pelos seus vários rios, pontes, ilhéus e penínsulas. Recife Antigo, na própria ilha junto ao porto, é o centro histórico da cidade antiga que data do século XVI. ",
            dataChegada = LocalDate.of(2019, 3, 14),
            dataPartida = LocalDate.of(2019, 4, 3)
        )

        val rioDeJaneiro = Viagens(
            id = 3,
            destino = "Rio de Janeiro",
            descricao = "O Rio de Janeiro é uma grande cidade brasileira à beira-mar, famosa pelas praias de Copacabana e Ipanema, pela estátua de 38 metros de altura do Cristo Redentor, no topo do Corcovado, e pelo Pão de Açúcar, um pico de granito com teleféricos até seu cume.",
            dataChegada = LocalDate.of(2019, 4, 5),
            dataPartida = LocalDate.of(2019, 5, 1),
            imagem = painterResource(id = R.drawable.riodejaneiro)
        )

        val havai = Viagens(
            id = 4,
            destino = "Havaí",
            descricao = "O Havaí, um estado dos EUA, é um arquipélago vulcânico isolado no Pacífico Central. Suas ilhas são conhecidas pelas paisagens acidentadas compostas de penhascos, cachoeiras, florestas tropicais e praias com areia dourada, vermelha, preta e até mesmo verde.",
            dataChegada = LocalDate.of(2019, 5, 10),
            dataPartida = LocalDate.of(2019, 6, 7),
            imagem = painterResource(id = R.drawable.havai)
        )

        val barcelona = Viagens(
            id = 5,
            destino = "Barcelona",
            descricao = "Barcelona, capital cosmopolita da região da Catalunha na Espanha, é conhecida pela sua arte e arquitetura. A fantástica igreja da Sagrada Família e outros monumentos modernistas projetados por Antoni Gaudí marcam a cidade.",
            dataChegada = LocalDate.of(2019, 7, 22),
            dataPartida = LocalDate.of(2019, 8, 19),
            imagem = painterResource(id = R.drawable.barcelona)
        )

        val carapicuiba = Viagens(
            id = 6,
            destino = "Carapicuiba",
            descricao = "Carapicuíba é um município no estado de São Paulo, Brasil, e faz parte da Região Metropolitana de São Paulo.",
            dataChegada = LocalDate.of(2019, 9, 16),
            dataPartida = LocalDate.of(2019, 10, 16)
        )

        return listOf(londres, recife, rioDeJaneiro, havai, barcelona, carapicuiba)




    }

}
