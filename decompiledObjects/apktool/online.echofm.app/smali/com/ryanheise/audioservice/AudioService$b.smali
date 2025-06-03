.class public Lcom/ryanheise/audioservice/AudioService$b;
.super La0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ryanheise/audioservice/AudioService;->Z(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic g:Lcom/ryanheise/audioservice/AudioService;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioService;III)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService$b;->g:Lcom/ryanheise/audioservice/AudioService;

    invoke-direct {p0, p2, p3, p4}, La0/o;-><init>(III)V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->H(I)V

    return-void
.end method

.method public e(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->x(I)V

    return-void
.end method
