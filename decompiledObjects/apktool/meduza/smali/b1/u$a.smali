.class public final Lb1/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lb1/x<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lb1/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb1/t<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Lb1/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb1/x<",
            "-TV;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(Lb1/t;Ly2/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lb1/u$a;->c:I

    iput-object p1, p0, Lb1/u$a;->a:Lb1/t;

    iput-object p2, p0, Lb1/u$a;->b:Lb1/x;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget v0, p0, Lb1/u$a;->c:I

    iget-object v1, p0, Lb1/u$a;->a:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->getVersion()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lb1/u$a;->a:Lb1/t;

    invoke-virtual {v0}, Lb1/t;->getVersion()I

    move-result v0

    iput v0, p0, Lb1/u$a;->c:I

    iget-object v0, p0, Lb1/u$a;->b:Lb1/x;

    invoke-interface {v0, p1}, Lb1/x;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
