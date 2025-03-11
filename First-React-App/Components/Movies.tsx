import { Card, CardBody, Image } from "@chakra-ui/react";
interface Props{
      imagePic:string;
}

function Movies({imagePic}:Props){
return(<>
<Card direction={{ base: 'column', sm: 'row' }}
  overflow='hidden'
  variant='outline'>
<CardBody>
      <Image src={imagePic}></Image>
</CardBody>
</Card>
</>);
}
export default Movies;