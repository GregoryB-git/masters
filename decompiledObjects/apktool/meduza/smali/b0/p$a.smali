.class public final Lb0/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb0/p;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld0/a;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb0/p$a;->a:Ld0/a;

    iput-object p2, p0, Lb0/p$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb0/p$a;->a:Ld0/a;

    iget-object v1, p0, Lb0/p$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ld0/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
