import { Grid, GridItem, ChakraProvider, Box, HStack } from "@chakra-ui/react";
import "./App.css";
import GameCards from "./Components/GameCards";
import Header from "./Components/Header";
import Marquee from "react-fast-marquee";
import Footer from "./Components/Footer";
import { Switch } from '@chakra-ui/react'

function App() {
  return (
    <>
      <ChakraProvider>
        <Grid templateAreas={'"nav nav"'}>
          <GridItem area={"nav"} bgColor="black">
            <Header></Header>
            
          </GridItem>
        </Grid>
        <Box
          w="100vw"
          h="100vh"
          bgImage="https://image.shutterstock.com/image-vector/abstract-elegant-diagonal-striped-purple-260nw-2148574371.jpg"
          bgSize="cover"
          bgPosition="center"
          position="relative"
        >
        <Marquee>
           <HStack spacing={'5'}>
          <GameCards
            imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fs2.dmcdn.net%2Fv%2FUgA4T1ZwWBT_4sMcZ&f=1&nofb=1&ipt=4f19380e41afd9216a6e9ef0f536751bde8bfcfc767ef394d3dcd0798ab2e58b&ipo=images"
            imageName="Animal Well"
            imageDesc="Explore a surreal, interconnected, labyrinth, and unravel its many secrets. 
                    Collect items,and solve puzzles. "
            imagePrice="$450"
          ></GameCards>

          <GameCards
            imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages8.alphacoders.com%2F130%2F1302413.jpg&f=1&nofb=1&ipt=053cec8a73f328b27b65555dcccc2cceb8f43263ebb55d8b6c3b12526b293f26&ipo=images"
            imageName="Clash of Clans"
            imageDesc="Players build and manage their village, defend it against other players,
                     and participate in multiplayer battles buildings to upgrade and unlock."
            imagePrice="$470"
          ></GameCards>

          <GameCards
            imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fnewsd.in%2Fwp-content%2Fuploads%2F2020%2F09%2FGarena-Free-Fire-1.jpg&f=1&nofb=1&ipt=fff65c4d380f8c46c4347d9ea7e788539dd363b3006c76e0475c7ca9ce8a4400&ipo=images"
            imageName="Free Fire"
            imageDesc="
                      The ultimate survival shooter game available on mobile. Each 10-minute 
                      game places you on a remote island where you are pit
                       against 49 other players, all seeking survival."
            imagePrice="$340"
          ></GameCards>
          <GameCards imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fshared.fastly.steamstatic.com%2Fstore_item_assets%2Fsteam%2Fapps%2F2397250%2Fheader.jpg%3Ft%3D1738857620&f=1&nofb=1&ipt=b2923bfae5eb6ef739eac0f6048b9da125103773b171955a4d71761b3a03ab4e&ipo=images"
          imageName="Big Helmet Heros" imageDesc="a 3D beat 'em up combining combat and adventure. Find 29 adorable heroes 
          hidden in fantastic kingdoms and choose your favorites to save the princess."
          imagePrice="$200">
          </GameCards>
          <GameCards imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fbleedingcool.com%2Fwp-content%2Fuploads%2F2024%2F08%2FEternal-Strands-Main-Art-2000x1125.jpg&f=1&nofb=1&ipt=06133399df0367e8e6cf759ff46796ed73ef395a79377e821d62a91b59a46b94&ipo=images"
          imageName="Eternal Strands"
          imageDesc="The player assumes control of Brynn, 
          a warrior who is on a quest to search for the secrets of a 
          long-lost civilization known as the Enclave."
          imagePrice="$390">
          </GameCards>
          </HStack>
          </Marquee>
        </Box>
        <Footer></Footer>
      </ChakraProvider>
    </>
  );
}

export default App;
