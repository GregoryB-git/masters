.class public final synthetic LA1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/lang/Integer;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA1/h;->o:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, LA1/h;->p:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LA1/h;->o:Ljava/lang/Integer;

    .line 2
    .line 3
    iget-object v1, p0, LA1/h;->p:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1}, LA1/g$b;->a(Ljava/lang/Integer;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
