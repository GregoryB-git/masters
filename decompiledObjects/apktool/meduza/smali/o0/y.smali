.class public final Lo0/y;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x1f7,
        0x151,
        0x153
    }
    m = "updateData"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Lec/s;

.field public e:Lo0/q;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic o:Lo0/q$d;

.field public p:I


# direct methods
.method public constructor <init>(Lo0/q$d;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/q$d;",
            "Lub/e<",
            "-",
            "Lo0/y;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/y;->o:Lo0/q$d;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/y;->f:Ljava/lang/Object;

    iget p1, p0, Lo0/y;->p:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/y;->p:I

    iget-object p1, p0, Lo0/y;->o:Lo0/q$d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lo0/q$d;->a(Lo0/g;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
