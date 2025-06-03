.class public final synthetic Lz/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lz/h$b;

.field public final synthetic p:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Lz/h$b;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/i;->o:Lz/h$b;

    .line 5
    .line 6
    iput-object p2, p0, Lz/i;->p:Landroid/graphics/Typeface;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz/i;->o:Lz/h$b;

    .line 2
    .line 3
    iget-object v1, p0, Lz/i;->p:Landroid/graphics/Typeface;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz/h$b;->a(Lz/h$b;Landroid/graphics/Typeface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
