.class public final synthetic LD0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/E$a;

.field public final synthetic p:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(LD0/E$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/z;->o:LD0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, LD0/z;->p:Ljava/lang/Exception;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LD0/z;->o:LD0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, LD0/z;->p:Ljava/lang/Exception;

    .line 4
    .line 5
    invoke-static {v0, v1}, LD0/E$a;->b(LD0/E$a;Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
