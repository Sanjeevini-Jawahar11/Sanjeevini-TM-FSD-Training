import './App.css'
import { ChakraProvider,HStack} from '@chakra-ui/react';
import { Input } from '@chakra-ui/react'
import Games from './Components/Movies';
import { Heading } from '@chakra-ui/react'
import Marquee from "react-fast-marquee";
import 'bootstrap/dist/css/bootstrap.min.css';
import Movies from './Components/Movies';

function App() {
  
  return (<>
  <ChakraProvider>
    <Heading>Movie Box</Heading>
    <div className="input-group">
  <span className="input-group-text">Movie</span>
  <textarea className="form-control" aria-label="With textarea"></textarea>
</div>
  <button type='submit' className="btn btn-secondary">Submit</button>
  <Marquee>
      <HStack>
      <Movies
            imagePic="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.mauvais-genres.com%2F39628-home_default%2Favatar-the-way-of-water-movie-poster-15x21-in-2022-james-cameron-kate-winslet.jpg&f=1&nofb=1&ipt=2baa6c08307bca4a247fbd36bd22eb7b96686ba500597dc48b64a5f13d443027&ipo=images"
          ></Movies>
          <Movies imagePic='https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fscifiward.com%2Fwp-content%2Fuploads%2F2011%2F08%2FPrometheus-Logo-300x300.jpg&f=1&nofb=1&ipt=3f05477090eddcbd146346bb674300dd2ab3d6ce2889a872c97e1dc16d04ab8d&ipo=images'>
          </Movies>
          <Movies imagePic='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.iceposter.com%2Fthumbs%2FMOV_41a273b3_b.jpg&f=1&nofb=1&ipt=a22c2906d2985c9100c24824c0ca5c8a3a8c036ad2713d9b402663c6f31f37da&ipo=images'></Movies>
      <Movies imagePic='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.pinimg.com%2F736x%2F45%2Ff0%2Fd5%2F45f0d5199afbbdd4c5b5c10682fe3472--teen-tv-teenage-years.jpg&f=1&nofb=1&ipt=a6d6ffacb5978d352d51ba23a483208f20e713b619ae18ed7e5df24f014cc4ef&ipo=images'>
      </Movies>
      <Movies imagePic='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.pinimg.com%2F236x%2F35%2Ffe%2F17%2F35fe17d246a6940c0fddb500b10f7959.jpg&f=1&nofb=1&ipt=2be09a7fc60834cf75a45adb14a4a1e940559a08e6af34881220591ba70fde21&ipo=images'></Movies>
      </HStack>
      </Marquee>
   </ChakraProvider>




  </>
  );
}

export default App
