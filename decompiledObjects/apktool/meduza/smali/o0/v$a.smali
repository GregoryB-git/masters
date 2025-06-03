.class public final Lo0/v$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/v;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2"
    f = "SingleProcessDataStore.kt"
    l = {
        0x89
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lo0/v;


# direct methods
.method public constructor <init>(Lo0/v;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lo0/v$a;->c:Lo0/v;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/v$a;->a:Ljava/lang/Object;

    iget p1, p0, Lo0/v$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/v$a;->b:I

    iget-object p1, p0, Lo0/v$a;->c:Lo0/v;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lo0/v;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
