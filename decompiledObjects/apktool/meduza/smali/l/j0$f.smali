.class public final Ll/j0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Ll/j0;


# direct methods
.method public constructor <init>(Ll/j0;)V
    .locals 0

    iput-object p1, p0, Ll/j0$f;->a:Ll/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll/j0$f;->a:Ll/j0;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/j0;->t:Ll/j0$f;

    invoke-virtual {v0}, Ll/j0;->drawableStateChanged()V

    return-void
.end method
