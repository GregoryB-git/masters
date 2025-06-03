.class public final Lx0/y$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/y;->c(Lx0/t;Lx0/p;Lx0/i;)V
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

    iput-object p1, p0, Lx0/y$g;->a:Lx0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx0/i;)V
    .locals 1

    iget-object v0, p0, Lx0/y$g;->a:Lx0/i;

    invoke-virtual {v0, p1}, Lx0/i;->onAttachFragment(Lx0/i;)V

    return-void
.end method
