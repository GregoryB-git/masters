.class public final Lea/w$f$a$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/w$f$a;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2"
    f = "SessionDatastore.kt"
    l = {
        0xdf
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lea/w$f$a;


# direct methods
.method public constructor <init>(Lea/w$f$a;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lea/w$f$a$a;->c:Lea/w$f$a;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lea/w$f$a$a;->a:Ljava/lang/Object;

    iget p1, p0, Lea/w$f$a$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lea/w$f$a$a;->b:I

    iget-object p1, p0, Lea/w$f$a$a;->c:Lea/w$f$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lea/w$f$a;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
