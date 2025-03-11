import { useEffect, useState } from "react";
import axios from "axios";
function MoviesList(){
    const[Movie,setMovie]=useState(-1);
    useEffect(()=>{
        axios.get('http://localhost:5175/MoviesList').then(response=>{
            setMovie(response.data);
        }).catch(error=>{
            console.error('There was an error',error);
        });
    },[]);

    return(
        <>
        <ul className="list-group">
  <li className="list-group-item active" aria-current="true">{Movie}</li>
  {/* <li className="list-group-item">A second item</li>
  <li className="list-group-item">A third item</li>
  <li className="list-group-item">A fourth item</li>
  <li className="list-group-item">And a fifth one</li> */}
</ul>
        </>
    );
}
export default MoviesList;