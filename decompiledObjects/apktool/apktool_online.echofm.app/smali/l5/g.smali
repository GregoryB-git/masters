.class public final synthetic Ll5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/ryanheise/audioservice/AudioService;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/g;->o:Lcom/ryanheise/audioservice/AudioService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/g;->o:Lcom/ryanheise/audioservice/AudioService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->t(Lcom/ryanheise/audioservice/AudioService;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
