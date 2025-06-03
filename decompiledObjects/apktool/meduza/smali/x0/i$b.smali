.class public final Lx0/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;)V
    .locals 0

    iput-object p1, p0, Lx0/i$b;->a:Lx0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/i$b;->a:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->startPostponedEnterTransition()V

    return-void
.end method
