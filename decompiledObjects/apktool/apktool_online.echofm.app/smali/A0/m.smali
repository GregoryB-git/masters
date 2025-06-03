.class public final synthetic LA0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/n;


# instance fields
.field public final synthetic o:LA0/n;


# direct methods
.method public synthetic constructor <init>(LA0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA0/m;->o:LA0/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LA0/m;->o:LA0/n;

    .line 2
    .line 3
    check-cast p1, Ld0/q;

    .line 4
    .line 5
    invoke-static {v0, p1}, LA0/n;->w(LA0/n;Ld0/q;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
