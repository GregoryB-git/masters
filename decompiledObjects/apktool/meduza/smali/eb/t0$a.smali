.class public final Leb/t0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Leb/t0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0$b<",
            "TReqT;>;"
        }
    .end annotation
.end field

.field public b:Leb/t0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0$b<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field public c:Leb/t0$c;

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Leb/t0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/t0<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    new-instance v6, Leb/t0;

    iget-object v1, p0, Leb/t0$a;->c:Leb/t0$c;

    iget-object v2, p0, Leb/t0$a;->d:Ljava/lang/String;

    iget-object v3, p0, Leb/t0$a;->a:Leb/t0$b;

    iget-object v4, p0, Leb/t0$a;->b:Leb/t0$b;

    iget-boolean v5, p0, Leb/t0$a;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Leb/t0;-><init>(Leb/t0$c;Ljava/lang/String;Leb/t0$b;Leb/t0$b;Z)V

    return-object v6
.end method
