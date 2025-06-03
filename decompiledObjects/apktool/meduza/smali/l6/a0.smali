.class public final Ll6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll6/d0;


# direct methods
.method public constructor <init>(Ll6/d0;I)V
    .locals 0

    iput-object p1, p0, Ll6/a0;->b:Ll6/d0;

    iput p2, p0, Ll6/a0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll6/a0;->b:Ll6/d0;

    iget v1, p0, Ll6/a0;->a:I

    invoke-virtual {v0, v1}, Ll6/d0;->f(I)V

    return-void
.end method
