.class public final synthetic LL5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LL5/w;

.field public final synthetic p:LV2/k;


# direct methods
.method public synthetic constructor <init>(LL5/w;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL5/n;->o:LL5/w;

    .line 5
    .line 6
    iput-object p2, p0, LL5/n;->p:LV2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LL5/n;->o:LL5/w;

    .line 2
    .line 3
    iget-object v1, p0, LL5/n;->p:LV2/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LL5/w;->g(LL5/w;LV2/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
