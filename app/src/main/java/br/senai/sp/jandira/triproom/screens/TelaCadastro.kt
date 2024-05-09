package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Novo Contato")
                    }
                },
                colors = TopAppBarDefaults
                    .topAppBarColors(
                        containerColor = Color(0xFFF78856),
                        titleContentColor = Color.White
                    )
            )
        },
        content = {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(24.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 150.dp, height = 150.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Card(
                            modifier = Modifier.fillMaxSize(),
                            shape = CircleShape
                        ) {
                            Surface(
                                modifier = Modifier.fillMaxSize(),
                                shape = CircleShape,
                                border = BorderStroke(width = 2.dp, color = Color.LightGray)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = "Foto",
                                    )
                            }
                        }

                        Card(
                            modifier = Modifier.size(width = 60.dp, height = 60.dp),
                            shape = CircleShape,
                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xFFF78856))
                        ) {
                            Box(modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Icon(imageVector = Icons.Default.CameraAlt, contentDescription = "" )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(22.dp))
                    OutlinedTextField(value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        label = {
                            Text(text = "Data de nascimento")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )

                    OutlinedTextField(value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        label = {
                            Text(text = "Email do contato")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )

                    OutlinedTextField(value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        label = {
                            Text(text = "Telefone do contato")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )

                    OutlinedTextField(value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        label = {
                            Text(text = "Data de nascimento")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(checked = false, onCheckedChange = {})
                        Text(text = "Amigo")
                    }

                    Button(onClick = { /*TODO*/ }) {

                        Text(text = "Gravar contato")
                        
                    }


                }
            }


        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}