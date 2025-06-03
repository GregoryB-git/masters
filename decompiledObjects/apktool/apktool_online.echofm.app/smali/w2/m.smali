.class public final synthetic Lw2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lw2/q;


# direct methods
.method public synthetic constructor <init>(Lw2/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/m;->o:Lw2/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/m;->o:Lw2/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw2/q;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
