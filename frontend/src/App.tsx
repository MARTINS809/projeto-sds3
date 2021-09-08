import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NaviBar from "components/NaviBar";
function App() {
  return (
    <>
      <NaviBar />
      <div className= "container">
        <h1 className="text-primary">Olá mundo!</h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
